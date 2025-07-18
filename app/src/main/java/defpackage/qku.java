package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qku {
    public final yrp a;

    public qku(yrp yrpVar) {
        this.a = yru.a(yrpVar);
    }

    public abstract void a(Runnable runnable);

    public final void b(final String str, final String str2) {
        a(new Runnable() { // from class: qkt
            @Override // java.lang.Runnable
            public final void run() {
                ((uqo) ((qlk) this.a.a.eV()).f.eV()).a(1L, str, str2);
            }
        });
    }

    public final void c(final String str, final String str2, final String str3, final String str4, final boolean z) {
        a(new Runnable() { // from class: qkq
            @Override // java.lang.Runnable
            public final void run() {
                ((uqo) ((qlk) this.a.a.eV()).c.eV()).a(1L, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void d(final String str, final String str2, final int i, final String str3, final boolean z) {
        a(new Runnable() { // from class: qkp
            @Override // java.lang.Runnable
            public final void run() {
                ((uqo) ((qlk) this.a.a.eV()).b.eV()).a(1L, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void e(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        a(new Runnable() { // from class: qkr
            @Override // java.lang.Runnable
            public final void run() {
                ((uqq) ((qlk) this.a.a.eV()).e.eV()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void f(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        a(new Runnable() { // from class: qks
            @Override // java.lang.Runnable
            public final void run() {
                ((uqq) ((qlk) this.a.a.eV()).d.eV()).b(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }
}
