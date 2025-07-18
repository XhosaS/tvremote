package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cuo extends cut {
    public abstract Random a();

    @Override // defpackage.cut
    public final int b() {
        return a().nextInt(2147418112);
    }
}
