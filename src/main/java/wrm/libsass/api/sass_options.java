package wrm.libsass.api;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
import java.util.Map;

/**
 * Thar be dragons.<br>
 * <i>native declaration : sass_interface.h:18</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class sass_options extends Structure {
  /// A value from above SASS_STYLE_* constants
  public int output_style;
  /// If you want inline source comments
  public byte source_comments;
  /**
   * Used to create sourceMappingUrl<br>
   * C type : const char*
   */
  public Pointer source_map_file;
  /// Disable sourceMappingUrl in css output
  public byte omit_source_map_url;
  /// embed sourceMappingUrl as data uri
  public byte source_map_embed;
  /// embed include contents in maps
  public byte source_map_contents;
  /// Treat source_string as sass (as opposed to scss)
  public byte is_indented_syntax_src;
  /**
   * Semicolon-separated on Windows<br>
   * C type : const char*
   */
  public Pointer include_paths;
  /**
   * For the image-url Sass function<br>
   * C type : const char*
   */
  public Pointer image_path;
  /// Precision for outputting fractional numbers
  public int precision;

  @Override
  protected List<String> getFieldOrder() {
    return Arrays.asList("output_style", "source_comments", "source_map_file", "omit_source_map_url", "source_map_embed", "source_map_contents", "is_indented_syntax_src", "include_paths", "image_path", "precision");
  }
}
