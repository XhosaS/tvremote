package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugy implements uef {
    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws ufx {
        if (ueeVar.b()) {
            throw new ufx("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(ueeVar.e))));
        }
        return new ugx(ueeVar.a, ueeVar.e);
    }
}
