package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obx extends Exception {
    public final nve a;

    public obx(nve nveVar) {
        ocv.au(nveVar.b(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = nveVar;
    }
}
