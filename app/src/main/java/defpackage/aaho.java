package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaho extends Exception {
    @Deprecated
    protected aaho() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaho(String str) {
        super(str);
        kkk.i(str, "Detail message must not be empty");
    }
}
