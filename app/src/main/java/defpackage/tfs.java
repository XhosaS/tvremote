package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfs {
    public final Optional a;

    public tfs(String str) {
        this.a = Optional.of(str);
        Optional.empty();
    }

    public tfs(String str, String str2) {
        this.a = Optional.of(str);
        Optional.of(str2);
    }
}
