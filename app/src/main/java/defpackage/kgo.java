package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kgo implements Runnable {
    final /* synthetic */ kgp a;

    public kgo(kgp kgpVar) {
        this.a = kgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        keg kegVar = this.a.a.b;
        kegVar.l(String.valueOf(kegVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
