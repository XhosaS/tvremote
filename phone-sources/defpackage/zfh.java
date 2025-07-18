package defpackage;

import java.io.IOException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfh extends IOException {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfh(int i) {
        super("stream was reset: ".concat(wbb.B(i)));
        Objects.toString(wbb.B(i));
        this.a = i;
    }
}
