package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tek {
    private static final zdy a = zdy.h("com/google/android/libraries/search/hostname/Hostname");

    public static zte a(String str, String str2) {
        yqw.B(!str.isEmpty(), "property name must be defined");
        yqw.B(!str2.isEmpty(), "default hostname must be defined");
        zte zteVarB = zte.b(new udn(str2.concat(":443")).a);
        if (!zteVarB.a.startsWith(str2)) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/search/hostname/Hostname", "propOrDefault", 40, "Hostname.java")).I("gRPC hostname was overwritten. %s:%d -> %s", str2, 443, zteVarB);
        }
        return zteVarB;
    }

    public static zte b() {
        return a("s3.grpc.url", "speechs3proto2-pa.googleapis.com");
    }
}
