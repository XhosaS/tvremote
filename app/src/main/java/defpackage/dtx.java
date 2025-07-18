package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtx {
    public dty a;
    public dru b;
    public final int c;
    public final String d;
    public final dug e;

    public dtx(String str, int i, String str2, dug dugVar) {
        this.c = i;
        this.d = str + i + str2;
        this.e = dugVar;
    }

    public final void a(Object obj) {
        dty dtyVar = this.a;
        if (dtyVar == null) {
            return;
        }
        dtyVar.at(this, obj);
    }
}
