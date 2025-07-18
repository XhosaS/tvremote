package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ecv {
    private String[] a;
    private boolean b;
    private boolean c;

    public ecv(String... strArr) {
        this.a = strArr;
    }

    protected abstract void a(String str);

    public final synchronized void b(String... strArr) {
        eci.b(!this.b, "Cannot set libraries after loading");
        this.a = strArr;
    }

    public final synchronized boolean c() {
        if (!this.b) {
            this.b = true;
            try {
                for (String str : this.a) {
                    a(str);
                }
                this.c = true;
            } catch (UnsatisfiedLinkError unused) {
                edb.e("LibraryLoader", "Failed to load ".concat(String.valueOf(Arrays.toString(this.a))));
            }
        }
        return this.c;
    }
}
