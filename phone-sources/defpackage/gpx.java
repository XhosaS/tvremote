package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpx {
    public static final gpx a;
    public static final gpx b;
    public static final gpx c;
    public static final gpx d;
    public static final gpx e;
    public static final gpx f;
    private static final /* synthetic */ gpx[] g;

    static {
        gpx gpxVar = new gpx("ENQUEUED", 0);
        a = gpxVar;
        gpx gpxVar2 = new gpx("RUNNING", 1);
        b = gpxVar2;
        gpx gpxVar3 = new gpx("SUCCEEDED", 2);
        c = gpxVar3;
        gpx gpxVar4 = new gpx("FAILED", 3);
        d = gpxVar4;
        gpx gpxVar5 = new gpx("BLOCKED", 4);
        e = gpxVar5;
        gpx gpxVar6 = new gpx("CANCELLED", 5);
        f = gpxVar6;
        gpx[] gpxVarArr = {gpxVar, gpxVar2, gpxVar3, gpxVar4, gpxVar5, gpxVar6};
        g = gpxVarArr;
        wcq.P(gpxVarArr);
    }

    private gpx(String str, int i) {
    }

    public static gpx[] values() {
        return (gpx[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
