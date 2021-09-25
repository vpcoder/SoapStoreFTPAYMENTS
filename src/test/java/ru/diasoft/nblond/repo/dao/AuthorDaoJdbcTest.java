package ru.diasoft.nblond.repo.dao;

/*
@DisplayName("Dao для работы с авторами должно")
@JdbcTest
@Import(AuthorDaoJdbc.class)
public class AuthorDaoJdbcTest {

    private static final int EXPECTED_AUTHORS_COUNT = 1;
    private static final int EXISTING_AUTHORS_ID = 0;
    private static final String EXISTING_AUTHORS_NAME = "test_author";

    @Autowired
    private AuthorDaoJdbc authorDao;

    @BeforeTransaction
    void beforeTransaction(){
        System.out.println("beforeTransaction");
    }

    @AfterTransaction
    void afterTransaction(){
        System.out.println("afterTransaction");
    }

    @DisplayName("возвращать ожидаемое количество авторов книг в БД")
    @Test
    void shouldReturnExpectedCount() {
        var actualCount = authorDao.count();
        assertThat(actualCount).isEqualTo(EXPECTED_AUTHORS_COUNT);
    }

    @Rollback
    @DisplayName("добавлять автора книг в БД")
    @Test
    void shouldInsert() {
        var expectedPerson = new Author(1, "test");
        authorDao.insert(expectedPerson);
        var actualPerson = authorDao.getById(expectedPerson.getId());
        assertThat(actualPerson).usingRecursiveComparison().isEqualTo(expectedPerson);
    }

    @DisplayName("возвращать ожидаемого автора книг по его id")
    @Test
    void shouldReturnExpectedById() {
        var expectedPerson = new Author(EXISTING_AUTHORS_ID, EXISTING_AUTHORS_NAME);
        var actualPerson = authorDao.getById(expectedPerson.getId());
        assertThat(actualPerson).usingRecursiveComparison().isEqualTo(expectedPerson);
    }

    @Rollback
    @DisplayName("удалять заданного автора книг по его id")
    @Test
    void shouldCorrectDeleteById() {
        assertThatCode(() -> authorDao.getById(EXISTING_AUTHORS_ID))
                .doesNotThrowAnyException();

        authorDao.deleteById(EXISTING_AUTHORS_ID);

        assertThatThrownBy(() -> authorDao.getById(EXISTING_AUTHORS_ID))
                .isInstanceOf(EmptyResultDataAccessException.class);
    }

    @DisplayName("возвращать ожидаемый список авторов книг")
    @Test
    void shouldReturnExpectedList() {
        var expectedPerson = new Author(EXISTING_AUTHORS_ID, EXISTING_AUTHORS_NAME);
        var actualPersonList = authorDao.getAll();
        assertThat(actualPersonList)
                .usingFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(expectedPerson);
    }

}*/