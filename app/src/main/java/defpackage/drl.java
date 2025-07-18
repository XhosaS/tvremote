package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drl {
    public final ByteArrayOutputStream a;
    public final PrintWriter b;
    private int c;

    public drl() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a = byteArrayOutputStream;
        this.b = new PrintWriter((OutputStream) byteArrayOutputStream, false);
    }

    private final void e() {
        for (int i = 0; i < this.c; i++) {
            this.b.print("  ");
        }
    }

    public final void a() {
        this.c++;
    }

    public final void b(String str, Object... objArr) {
        e();
        PrintWriter printWriter = this.b;
        printWriter.printf(str, objArr);
        printWriter.print('\n');
    }

    public final void c(String str) {
        e();
        this.b.println(str);
    }

    public final void d() {
        this.c--;
    }
}
