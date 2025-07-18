package java.io;

/* loaded from: classes4.dex */
public class UncheckedIOException extends RuntimeException {
    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
