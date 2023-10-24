package javaCore.ZZJCrud.repositotry;

import javaCore.ZZJCrud.conn.ConnectionFactory;
import javaCore.ZZJCrud.dominio.Anime;
import javaCore.ZZJCrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}'", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_name"))
                        .build();
                Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find animes by name '{}'", name, e);
        }
        return animes;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                 SELECT a.id, a.name, a.episodes, a.produce_id, p.name as 'produce_name' FROM anime_store.anime a inner join
                 anime_store.producer p on a.produce_id = p.id 
                where a.name like '%%' ?  ;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Anime by ID '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            Producer producer = Producer.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_name"))
                    .build();
            Anime anime = Anime.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);
        } catch (SQLException e) {
            log.error("Error while trying to find anime by ID '{}'", id, e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                 SELECT a.id, a.name, a.episodes, a.produce_id, p.name as 'produce_name' FROM anime_store.anime a inner join
                 anime_store.producer p on a.produce_id = p.id 
                where a.name = ? ;
                """;

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted anime '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        log.info("Saving Anime '{}'", anime);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save anime '{}'", anime.getName(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Anime anime) throws SQLException {

       String sql = " INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `produce_id`) VALUES (?, ?, ?);";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
    public static void update(Anime anime) {
        log.info("Updating anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ?  WHERE (`id` = ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
