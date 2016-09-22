package host;

public class Application {
  public static void main(String[] args) throws Exception {
    if (args.length < 1) {
      throw new Error("Argument 1 should be a plugin class name.");
    }
    new Application().loadPlugin(args[0]);
  }

  private void loadPlugin(String pluginClassName) throws Exception {
    Class<?> pluginClass = getClass().getClassLoader().loadClass(pluginClassName);
    plugin.Plugin instance = (plugin.Plugin) pluginClass.newInstance();
    instance.attach(this);
  }
}
