package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afht extends RuntimeException {
    private static final long serialVersionUID = 1;

    public afht() {
        super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}
