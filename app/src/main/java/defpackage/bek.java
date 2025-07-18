package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bek {
    public static final bes a = new bej();
    public final bev b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bek(bel belVar, beg begVar) {
        this(belVar, begVar, ber.a);
        belVar.getClass();
    }

    public final beb a(agxd agxdVar) {
        String strB = agxdVar.b();
        if (strB != null) {
            return this.b.a(agxdVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public bek(bel belVar, beg begVar, bet betVar) {
        belVar.getClass();
        begVar.getClass();
        betVar.getClass();
        this.b = new bev(belVar, begVar, betVar);
    }

    public bek(bem bemVar, beg begVar) {
        this(bemVar.el(), begVar, bfa.a.b(bemVar));
    }
}
