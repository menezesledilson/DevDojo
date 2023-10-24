package javaCore.ZZKjunit.dominio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MangaTest {
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    public void SetUp(){
        manga1 = new Manga("Nanatsu no Taizai", 12);
        manga2 = new Manga("Nanatsu no Taizai", 12);
    }

    @Test
    @DisplayName("Return Data When Initialized")
    public void accessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Nanatsu no Taizai", manga1.name());
        Assertions.assertEquals(12, manga1.episodes());
    }
    @Test
    @DisplayName("Return True When Objects Data Are The Same")
    public void equals_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1,manga2);
    }

    @Test
    @DisplayName("Return True When Objects HashCode Are The Same")
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(),manga2.hashCode());
    }
    @Test
    @DisplayName("Throw NullPointerException When Name Is Null")
    public void constructor_ThrowNullPointerException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Manga(null,12));
    }
    @Test
    @DisplayName("Return True When verify if Manga is Record")
    public void isRecord_ReturnTrue_WhenCalledFromManga(){
        Assertions.assertTrue(Manga.class.isRecord());
    }

}