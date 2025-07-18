package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zew {
    public static final zew c = new zes();
    public static final zew d = new zes();

    protected zew() {
    }

    static zew b(zew zewVar, zew zewVar2) {
        zew zewVar3;
        zew zewVar4;
        if (zewVar != null) {
            if (zewVar2 == null || zewVar == (zewVar3 = c) || zewVar2 == (zewVar4 = d)) {
                return zewVar;
            }
            if (zewVar2 != zewVar3 && zewVar != zewVar4) {
                return new zet(zewVar, zewVar2);
            }
        }
        return zewVar2;
    }

    protected abstract void a();
}
