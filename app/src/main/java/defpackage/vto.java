package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vto {
    public abstract vts a();

    public final vts b() {
        vts vtsVarA = a();
        if (((vtc) vtsVarA).l.g()) {
            yqw.B(!((String) r1.c()).contains(":"), "Worker target process must either be a custom process like 'my_process' or the empty String '' for the Android default process.");
        }
        return vtsVarA;
    }
}
