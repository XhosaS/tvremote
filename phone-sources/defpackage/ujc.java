package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ujc extends Exception {
    @Deprecated
    protected ujc() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujc(String str) {
        super(str);
        ocv.aE(str, "Detail message must not be empty");
    }
}
