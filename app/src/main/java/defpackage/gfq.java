package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gfq {
    public static /* synthetic */ void a(gfr gfrVar, rqw rqwVar, abqb abqbVar, int i) {
        if ((i & 2) != 0) {
            abqbVar = abqb.OK;
        }
        gfrVar.c(rqwVar, abqbVar, null, null);
    }

    public static /* synthetic */ void b(gfr gfrVar, rqs rqsVar, abqb abqbVar, Duration duration, int i) {
        if ((i & 2) != 0) {
            abqbVar = abqb.OK;
        }
        if ((i & 4) != 0) {
            duration = null;
        }
        gfrVar.a(rqsVar, abqbVar, duration, null);
    }
}
