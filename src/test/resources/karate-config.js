function config() {
    var env = karate.env; // get system property 'karate.env'
    karate.log('karate.env system property was:', env);
    karate.configure('ssl',true);
    karate.configure('readTimeout', 70000);
    karate.configure('connectTimeout', 70000);
    if (!env) {
      env = 'dev';
    }
    var data = read('classpath:karate/env_data.json');
    var env_data = data[env];

    env_data.retryCount = 4;
    env_data.retryInterval = 70000;

    return env_data;
}