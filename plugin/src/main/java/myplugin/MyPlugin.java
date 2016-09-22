package myplugin;

import host.Application;

public class MyPlugin implements plugin.Plugin {
  @Override public void attach(Application app) {
    System.out.println("Hello from MyPlugin!");
  }
}
