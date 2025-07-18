package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class waf {
    public final wag a(final boolean z, boolean z2) {
        return new wag(new agum() { // from class: wad
            @Override // defpackage.agum
            public final Object a() {
                return Boolean.valueOf(z);
            }
        }, 2, z2, 4);
    }

    public final wag b(final double d) {
        return new wag(new agum() { // from class: wac
            @Override // defpackage.agum
            public final Object a() {
                return Double.valueOf(d);
            }
        }, 3, false, 4);
    }

    public final wag c(final long j) {
        return new wag(new agum() { // from class: wab
            @Override // defpackage.agum
            public final Object a() {
                return Long.valueOf(j);
            }
        }, 1, false, 4);
    }

    public final wag d(agum agumVar, MessageLite messageLite) {
        messageLite.getClass();
        return new wag(agumVar, 6, messageLite, false);
    }

    public final wag e(final String str) {
        return new wag(new agum() { // from class: wae
            @Override // defpackage.agum
            public final Object a() {
                return str;
            }
        }, 4, false, 4);
    }
}
