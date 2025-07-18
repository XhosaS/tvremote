package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abdz implements Closeable, Flushable {
    public static final Pattern a = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] g = new String[128];
    private static final String[] h;
    public final Writer b;
    public boolean c;
    public String d;
    public boolean e;
    public int f;
    private int[] i = new int[32];
    private int j = 0;
    private abak k;
    private String l;
    private String m;
    private boolean n;

    static {
        for (int i = 0; i <= 31; i++) {
            g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        h = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public abdz(Writer writer) {
        k(6);
        this.f = 2;
        this.e = true;
        this.b = writer;
        c(abak.a);
    }

    private final void j() throws IOException {
        if (this.n) {
            return;
        }
        Writer writer = this.b;
        writer.write(this.k.b);
        int i = this.j;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.k.c);
        }
    }

    private final void k(int i) {
        int i2 = this.j;
        int[] iArr = this.i;
        if (i2 == iArr.length) {
            this.i = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.i;
        int i3 = this.j;
        this.j = i3 + 1;
        iArr2[i3] = i;
    }

    private final void l(int i) {
        this.i[this.j - 1] = i;
    }

    public final int a() {
        int i = this.j;
        if (i != 0) {
            return this.i[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void b() throws IOException {
        int iA = a();
        if (iA == 1) {
            l(2);
            j();
            return;
        }
        if (iA == 2) {
            this.b.append((CharSequence) this.m);
            j();
        } else {
            if (iA == 4) {
                this.b.append((CharSequence) this.l);
                l(5);
                return;
            }
            if (iA != 6) {
                if (iA != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            l(7);
        }
    }

    public final void c(abak abakVar) {
        abakVar.getClass();
        this.k = abakVar;
        this.m = ",";
        if (abakVar.d) {
            this.l = ": ";
            if (abakVar.b.isEmpty()) {
                this.m = ", ";
            }
        } else {
            this.l = ":";
        }
        boolean z = false;
        if (this.k.b.isEmpty() && this.k.c.isEmpty()) {
            z = true;
        }
        this.n = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
        int i = this.j;
        if (i > 1 || (i == 1 && this.i[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.c
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.abdz.h
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.abdz.g
        L9:
            java.io.Writer r1 = r9.b
            r2 = 34
            r1.write(r2)
            int r3 = r10.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L40
            int r6 = r4 + 1
            char r7 = r10.charAt(r4)
            r8 = 128(0x80, float:1.8E-43)
            if (r7 >= r8) goto L27
            r7 = r0[r7]
            if (r7 == 0) goto L3e
            goto L34
        L27:
            r8 = 8232(0x2028, float:1.1535E-41)
            if (r7 != r8) goto L2e
            java.lang.String r7 = "\\u2028"
            goto L34
        L2e:
            r8 = 8233(0x2029, float:1.1537E-41)
            if (r7 != r8) goto L3e
            java.lang.String r7 = "\\u2029"
        L34:
            if (r5 >= r4) goto L3a
            int r4 = r4 - r5
            r1.write(r10, r5, r4)
        L3a:
            r1.write(r7)
            r5 = r6
        L3e:
            r4 = r6
            goto L16
        L40:
            if (r5 >= r3) goto L46
            int r3 = r3 - r5
            r1.write(r10, r5, r3)
        L46:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdz.d(java.lang.String):void");
    }

    public final void e() throws IOException {
        if (this.d != null) {
            int iA = a();
            if (iA == 5) {
                this.b.write(this.m);
            } else if (iA != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            j();
            l(4);
            d(this.d);
            this.d = null;
        }
    }

    public final void f(int i) {
        if (i == 0) {
            throw null;
        }
        this.f = i;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.b.flush();
    }

    public final void g(int i, int i2, char c) throws IOException {
        int iA = a();
        if (iA != i2 && iA != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.d;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.j--;
        if (iA == i2) {
            j();
        }
        this.b.write(c);
    }

    public final void h() throws IOException {
        if (this.d != null) {
            if (!this.e) {
                this.d = null;
                return;
            }
            e();
        }
        b();
        this.b.write("null");
    }

    public final void i(int i, char c) throws IOException {
        b();
        k(i);
        this.b.write(c);
    }
}
