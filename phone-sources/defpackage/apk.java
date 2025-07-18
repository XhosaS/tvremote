package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class apk {
    public static final apk a;
    public static final apk b;
    public static final apk c;
    public static final apk d;
    public static final apk e;
    private static final /* synthetic */ apk[] f;

    static {
        apk apkVar = new apk("TopBar", 0);
        a = apkVar;
        apk apkVar2 = new apk("MainContent", 1);
        b = apkVar2;
        apk apkVar3 = new apk("Snackbar", 2);
        c = apkVar3;
        apk apkVar4 = new apk("Fab", 3);
        d = apkVar4;
        apk apkVar5 = new apk("BottomBar", 4);
        e = apkVar5;
        apk[] apkVarArr = {apkVar, apkVar2, apkVar3, apkVar4, apkVar5};
        f = apkVarArr;
        wcq.P(apkVarArr);
    }

    private apk(String str, int i) {
    }

    public static apk[] values() {
        return (apk[]) f.clone();
    }
}
