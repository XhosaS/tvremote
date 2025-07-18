package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class awb {
    public static final awb a;
    public static final awb b;
    private static final /* synthetic */ awb[] c;

    static {
        awb awbVar = new awb("Dismissed", 0);
        a = awbVar;
        awb awbVar2 = new awb("ActionPerformed", 1);
        b = awbVar2;
        awb[] awbVarArr = {awbVar, awbVar2};
        c = awbVarArr;
        wcq.P(awbVarArr);
    }

    private awb(String str, int i) {
    }

    public static awb[] values() {
        return (awb[]) c.clone();
    }
}
