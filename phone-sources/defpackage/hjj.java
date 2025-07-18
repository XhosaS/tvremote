package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjj {
    public Object a;
    public hjm b;
    public hjn c = new hjn();
    private boolean d;

    public final void a(Object obj) {
        this.d = true;
        hjm hjmVar = this.b;
        if (hjmVar == null || !hjmVar.b.d(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    protected final void finalize() {
        hjn hjnVar;
        hjm hjmVar = this.b;
        if (hjmVar != null && !hjmVar.isDone()) {
            hjmVar.a(new hjk("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(String.valueOf(this.a)))));
        }
        if (this.d || (hjnVar = this.c) == null) {
            return;
        }
        hjnVar.d(null);
    }
}
