package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eda extends dyc {
    final /* synthetic */ edf a;
    private final emk c;
    private boolean d;
    private int e;
    private String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eda(edf edfVar, emk emkVar) {
        super(false);
        this.a = edfVar;
        boolean z = ebc.a;
        this.e = -1;
        this.c = emkVar;
    }

    @Override // defpackage.dyc
    public final void a(dyc dycVar) {
        synchronized (this) {
            if (this.d) {
                int i = this.e;
                String str = this.f;
                this.e = -1;
                this.f = null;
                this.d = false;
                try {
                    this.a.o(i, str, dycVar);
                } catch (IndexOutOfBoundsException e) {
                    edf edfVar = this.a;
                    throw edf.d(edfVar, edfVar.i, e);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.d) {
            this.d = false;
            this.e = -1;
            this.f = null;
            this.c.a(this);
        }
    }

    public final synchronized void c(int i, String str) {
        if (this.d) {
            return;
        }
        this.d = true;
        Throwable th = this.b;
        if (th != null) {
            th.fillInStackTrace();
        }
        this.c.c(this);
        this.e = i;
        this.f = str;
    }
}
