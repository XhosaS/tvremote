package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scb {
    public final ruo a;
    public final byte[] b;
    public long c = Long.MIN_VALUE;
    public int d;
    public int e;
    public int f;
    private final yqt g;

    public scb(ruo ruoVar, int i, yqt yqtVar) {
        this.a = ruoVar;
        this.g = yqtVar;
        this.b = new byte[i];
    }

    public final rsu a(rsu rsuVar, long j, long j2) {
        rth rthVarA;
        yqt yqtVar = this.g;
        if (yqtVar.g()) {
            Object objC = yqtVar.c();
            if (j2 < j) {
                ((zdv) sli.a.d().q("com/google/android/libraries/search/audio/core/timestamp/TimestampProvider", "getTimestampForByteRange", 48, "TimestampProvider.kt")).C("#audio# getTimestampForByteRange called with invalid range [%d, %d]", j, j2);
                rth rthVar = rth.a;
                rsz rszVar = new rsz();
                rtb rtbVar = rtb.a;
                rtb rtbVarA = ryv.a(new rta());
                if ((rszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    rszVar.y();
                }
                rth rthVar2 = (rth) rszVar.b;
                rthVar2.c = rtbVarA;
                rthVar2.b = 4;
                rthVarA = ryu.a(rszVar);
            } else {
                sli sliVar = (sli) objC;
                rth rthVar3 = (rth) sliVar.d.get();
                if (rthVar3.b == 1) {
                    long j3 = sliVar.b;
                    long j4 = j / j3;
                    long j5 = j2 / j3;
                    rtf rtfVar = (rtf) rthVar3.c;
                    long j6 = rtfVar.d;
                    if (j4 > j6 || j6 > j5) {
                        rtfVar.getClass();
                        long j7 = rtfVar.c + ((j4 - j6) * sliVar.c);
                        rsz rszVar2 = new rsz();
                        rte rteVar = new rte();
                        if ((rteVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rteVar.y();
                        }
                        rtf rtfVar2 = (rtf) rteVar.b;
                        rtfVar2.b |= 2;
                        rtfVar2.d = j4;
                        if ((rteVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rteVar.y();
                        }
                        rtf rtfVar3 = (rtf) rteVar.b;
                        rtfVar3.b |= 1;
                        rtfVar3.c = j7;
                        ryw.b(3, rteVar);
                        rtf rtfVarA = ryw.a(rteVar);
                        if ((rszVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            rszVar2.y();
                        }
                        rth rthVar4 = (rth) rszVar2.b;
                        rthVar4.c = rtfVarA;
                        rthVar4.b = 1;
                        rthVarA = ryu.a(rszVar2);
                    } else {
                        rthVar3.getClass();
                    }
                } else {
                    rthVar3.getClass();
                }
                rthVarA = rthVar3;
            }
            rst rstVar = new rst();
            rstVar.B(rsuVar);
            if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rstVar.y();
            }
            rsu rsuVar2 = (rsu) rstVar.b;
            rsuVar2.e = rthVarA;
            rsuVar2.b |= 1;
            rsuVar = rsq.a(rstVar);
        }
        if (this.c != Long.MIN_VALUE) {
            rst rstVar2 = new rst();
            rstVar2.B(rsuVar);
            long j8 = this.c;
            if ((rstVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                rstVar2.y();
            }
            rsu rsuVar3 = (rsu) rstVar2.b;
            rsuVar3.b |= 2;
            rsuVar3.f = j8;
            rsuVar = rsq.a(rstVar2);
        }
        rst rstVar3 = new rst();
        rstVar3.B(rsuVar);
        int i = this.f;
        if ((rstVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rstVar3.y();
        }
        rsu rsuVar4 = (rsu) rstVar3.b;
        rsuVar4.b = 4 | rsuVar4.b;
        rsuVar4.g = i;
        return rsq.a(rstVar3);
    }

    public final rsu b(boolean z) {
        if (this.d == 0) {
            return null;
        }
        rsu rsuVar = rsu.a;
        rst rstVar = new rst();
        rss rssVar = rss.a;
        rsr rsrVar = new rsr();
        abvo abvoVarU = abvo.u(this.b, 0, this.d);
        if ((rsrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rsrVar.y();
        }
        rss rssVar2 = (rss) rsrVar.b;
        rssVar2.b |= 1;
        rssVar2.c = abvoVarU;
        rss rssVarA = rud.a(rsrVar);
        if ((rstVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            rstVar.y();
        }
        rsu rsuVar2 = (rsu) rstVar.b;
        rsuVar2.d = rssVarA;
        rsuVar2.c = 1;
        rsu rsuVarA = a(rsq.a(rstVar), r0 - this.d, this.e - 1);
        if (z) {
            this.d = 0;
        }
        return rsuVarA;
    }
}
