package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ukf {
    public final unl a;
    public final acpf b;
    public final ujs c;
    public final zyh d;
    public final ExtensionRegistryLite e;
    public yqt f;
    public yqt g;
    public final TimeUnit h;
    public final TimeUnit i;
    public final mcw j;
    public final int k;

    public ukf(unl unlVar, acpf acpfVar, ujs ujsVar, zyh zyhVar, mcw mcwVar, int i, ExtensionRegistryLite extensionRegistryLite) {
        ypv ypvVar = ypv.a;
        this.f = ypvVar;
        this.g = ypvVar;
        this.h = TimeUnit.SECONDS;
        this.i = TimeUnit.SECONDS;
        this.a = unlVar;
        this.b = acpfVar;
        this.c = ujsVar;
        this.d = zyhVar;
        this.j = mcwVar;
        this.k = i;
        this.e = extensionRegistryLite;
    }
}
