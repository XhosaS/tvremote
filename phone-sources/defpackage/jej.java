package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jej implements yft {
    private final ymh a;
    private final yjk b;
    private final xce c;
    private dwt d;

    public jej(ymh ymhVar, yjk yjkVar, xce xceVar) {
        this.a = ymhVar;
        this.b = yjkVar;
        this.c = xceVar;
    }

    @Override // defpackage.yft
    public final /* bridge */ /* synthetic */ Object a() {
        dwt dwtVar = this.d;
        if (dwtVar != null) {
            return dwtVar;
        }
        dwt dwtVarA = new dxa((dxd) this.b.a()).a(wef.o(this.a));
        try {
            xby<Object> xbyVarAndroidInjector = this.c.androidInjector();
            if (xbyVarAndroidInjector != null) {
                xbyVarAndroidInjector.a(dwtVarA);
            }
            this.d = dwtVarA;
            return dwtVarA;
        } catch (IllegalArgumentException e) {
            ymh ymhVar = this.a;
            throw new IllegalArgumentException("\n              Unable to generate ViewModel of type " + ymhVar.c() + ": " + e + "\". \n              Did you miss \n              \n              @ContributesAndroidInjector\n              fun contributesViewModel(): " + ymhVar.c() + "  \n              \n              in activity/fragment dagger module?\n            ");
        }
    }

    @Override // defpackage.yft
    public final boolean b() {
        throw null;
    }
}
