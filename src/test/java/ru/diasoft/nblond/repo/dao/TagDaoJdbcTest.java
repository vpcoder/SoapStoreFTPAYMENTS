package ru.diasoft.nblond.repo.dao;

/*
@DisplayName("Dao для работы с авторами должно")
@JdbcTest
@Import(TagDaoJdbc.class)
public class TagDaoJdbcTest {

    private static final int EXPECTED_TAGS_COUNT = 1;
    private static final int EXISTING_TAGS_ID = 0;
    private static final String EXISTING_TAGS_NAME = "test_tag";

    @Autowired
    private TagDaoJdbc tagDao;

    @BeforeTransaction
    void beforeTransaction(){
        System.out.println("beforeTransaction");
    }

    @AfterTransaction
    void afterTransaction(){
        System.out.println("afterTransaction");
    }

    @DisplayName("возвращать ожидаемое количество жанров в БД")
    @Test
    void shouldReturnExpectedCount() {
        var actualPersonsCount = tagDao.count();
        assertThat(actualPersonsCount).isEqualTo(EXPECTED_TAGS_COUNT);
    }

    @Rollback
    @DisplayName("добавлять жанры в БД")
    @Test
    void shouldInsert() {
        var expected = new Tag(1, "test");
        tagDao.insert(expected);
        var actual = tagDao.getById(expected.getId());
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @DisplayName("возвращать ожидаемый жанр по id")
    @Test
    void shouldReturnExpectedById() {
        var expected = new Tag(EXISTING_TAGS_ID, EXISTING_TAGS_NAME);
        var actual = tagDao.getById(expected.getId());
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Rollback
    @DisplayName("удалять заданную книгу по её id")
    @Test
    void shouldCorrectDeleteById() {
        assertThatCode(() -> tagDao.getById(EXISTING_TAGS_ID))
                .doesNotThrowAnyException();

        tagDao.deleteById(EXISTING_TAGS_ID);

        assertThatThrownBy(() -> tagDao.getById(EXISTING_TAGS_ID))
                .isInstanceOf(EmptyResultDataAccessException.class);
    }

    @DisplayName("возвращать ожидаемый список книг")
    @Test
    void shouldReturnExpectedList() {
        var expected = new Tag(EXISTING_TAGS_ID, EXISTING_TAGS_NAME);
        var actualList = tagDao.getAll();
        assertThat(actualList)
                .usingFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(expected);
    }

}*/