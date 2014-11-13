package wrm.libsass.api;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
/**
 * <i>native declaration : sass_interface.h:45</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class sass_context extends Structure {
  /// C type : const char*
  public String input_path;
  /// C type : const char*
  public String output_path;
  /// C type : const char*
  public String source_string;
  /// C type : char*
  public Pointer output_string;
  /// C type : char*
  public Pointer source_map_string;
  /// C type : sass_options
  public sass_options options;
  public int error_status;
  /// C type : char*
  public Pointer error_message;
  /// C type : Sass_C_Function_Descriptor*
  public Pointer c_functions;
  /// C type : char**
  public PointerByReference included_files;
  public int num_included_files;

  @Override
  protected List<String> getFieldOrder() {
    return Arrays.asList("input_path", "output_path", "source_string", "output_string", "source_map_string", "options", "error_status", "error_message", "c_functions", "included_files", "num_included_files");
  }
}