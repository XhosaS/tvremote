package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdq extends zcn {
    private final String a;
    private final long b;
    private final zgm c;

    public zdq(String str, long j, zgm zgmVar) {
        this.a = str;
        this.b = j;
        this.c = zgmVar;
    }

    @Override // defpackage.zcn
    public final long a() {
        return this.b;
    }

    @Override // defpackage.zcn
    public final zcg b() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        Pattern pattern = zcg.a;
        return wbb.M(str);
    }

    @Override // defpackage.zcn
    public final zgm c() {
        return this.c;
    }
}
