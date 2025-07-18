package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itc implements ism {
    private final String a = "action.devices.traits.TransportControl";

    @Override // defpackage.ism
    public final Object a(agsw agswVar) {
        abaq abaqVar = new abaq();
        abaqVar.d("NEXT");
        abaqVar.d("PREVIOUS");
        abaqVar.d("PAUSE");
        abaqVar.d("STOP");
        abaqVar.d("RESUME");
        abaqVar.d("SEEK_TO_POSITION");
        abaqVar.d("SEEK_RELATIVE");
        return agrj.c(new agpi("transportControlSupportedCommands", abaqVar));
    }

    @Override // defpackage.ism
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ism
    public final boolean c() {
        return true;
    }
}
