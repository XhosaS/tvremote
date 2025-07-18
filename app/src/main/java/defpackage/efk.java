package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efk extends efa {
    private final drq a;
    private final String b;
    private final ohv c;

    public efk(efi efiVar) {
        super(efiVar);
        drq drqVar = efiVar.b;
        if (drqVar == null) {
            throw new IllegalStateException("Component must be provided.");
        }
        this.a = drqVar;
        this.c = efiVar.d;
        this.b = efiVar.c;
    }

    public static ejm n() {
        efi efiVar = new efi();
        efiVar.b = new efj();
        return new efk(efiVar);
    }

    @Override // defpackage.efa, defpackage.ejm
    public final drq b() {
        return this.a;
    }

    @Override // defpackage.efa, defpackage.ejm
    public final String e() {
        return this.b;
    }

    @Override // defpackage.efa, defpackage.ejm
    public final ohv i() {
        return this.c;
    }

    @Override // defpackage.ejm
    public final String o() {
        return this.a.d();
    }

    @Override // defpackage.efa, defpackage.ejm
    public final void k() {
    }

    @Override // defpackage.efa, defpackage.ejm
    public final void l() {
    }
}
