package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtl extends abww implements abyr {
    public adtl() {
        super(adtn.a);
    }

    public final void a(String str, adtk adtkVar) {
        adtkVar.getClass();
        if ((this.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            y();
        }
        adtn adtnVar = (adtn) this.b;
        adtn adtnVar2 = adtn.a;
        abyl abylVar = adtnVar.b;
        if (!abylVar.b) {
            adtnVar.b = abylVar.a();
        }
        adtnVar.b.put(str, adtkVar);
    }
}
