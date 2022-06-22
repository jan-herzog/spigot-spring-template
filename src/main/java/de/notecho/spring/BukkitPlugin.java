package de.notecho.spring;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BukkitPlugin extends JavaPlugin {

    @Getter
    private static AnnotationConfigApplicationContext context;

    @Override
    public void onEnable() {
        Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
        context = new AnnotationConfigApplicationContext(Application.class);
        //enable code
        context.registerShutdownHook();
    }
}
