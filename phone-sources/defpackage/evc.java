package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evc extends IOException {
    public evc(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public evc(int i, long j, long j2) {
        String strCv;
        if (i != 0) {
            if (i != 1) {
                a.ab((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                strCv = a.cv(j2, j, "start exceeds end. Start time: ", ", End time: ");
            } else {
                strCv = "not seekable to start";
            }
        } else {
            strCv = "invalid period count";
        }
        super("Illegal clipping: ".concat(strCv));
    }
}
