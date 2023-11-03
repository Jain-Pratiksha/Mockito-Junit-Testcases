// Mockito Junit for ThreadPoolTaskExecutor

// To Mock

// @Autowired
// @Qualifier("executor")
// Executor taskexecutor;

// ((ThreadPoolTaskExecutor)taskexecutor).getThreadPoolExecutor()


// Junit

@Mock
private ThreadPoolTaskExecutor ThreadPoolTaskExecutor;

ThreadPoolTaskExecutor executor = getThreadPoolTaskExecutor();
when(ThreadPoolTaskExecutor.getThreadPoolExecutor())
        .thenReturn(executor.getThreadPoolExecutor());
