package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afrt extends afmv {
    private static final afgs a;
    private static final afid b;
    private Status c;
    private afih d;
    private Charset e;
    private boolean f;

    static {
        afrs afrsVar = new afrs();
        a = afrsVar;
        b = afgt.a(":status", afrsVar);
    }

    protected afrt(int i, afzw afzwVar, agae agaeVar) {
        super(i, afzwVar, agaeVar);
        this.e = StandardCharsets.UTF_8;
    }

    private final Status f(afih afihVar) {
        char cCharAt;
        Integer num = (Integer) afihVar.a(b);
        if (num == null) {
            return Status.k.withDescription("Missing HTTP status code");
        }
        String str = (String) afihVar.a(afrq.g);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return afrq.a(num.intValue()).a("invalid content-type: ".concat(String.valueOf(str)));
    }

    private static Charset s(afih afihVar) {
        String str = (String) afihVar.a(afrq.g);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void t(afih afihVar) {
        afihVar.c(b);
        afihVar.c(afgv.b);
        afihVar.c(afgv.a);
    }

    protected abstract void c(Status status, boolean z, afih afihVar);

    protected final void p(afwn afwnVar, boolean z) {
        Status status = this.c;
        boolean z2 = false;
        if (status != null) {
            Charset charset = this.e;
            afwn afwnVar2 = afwr.a;
            charset.getClass();
            int iG = afwnVar.g();
            byte[] bArr = new byte[iG];
            afwnVar.l(bArr, 0, iG);
            this.c = status.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            afwnVar.close();
            if (this.c.getDescription().length() > 1000 || z) {
                c(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            afwnVar.close();
            c(Status.k.withDescription("headers not received before payload"), false, new afih());
            return;
        }
        int iG2 = afwnVar.g();
        boolean z3 = true;
        try {
            if (this.n) {
                afmw.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                afwnVar.close();
            } else {
                try {
                    afox afoxVar = this.o;
                    try {
                        if (((afvg) afoxVar).b() || ((afvg) afoxVar).f) {
                            afwnVar.close();
                        } else {
                            ((afvg) afoxVar).d.i(afwnVar);
                            try {
                                ((afvg) afoxVar).a();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                                if (z3) {
                                    afwnVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        b(th3);
                    } catch (Throwable th4) {
                        th = th4;
                        if (z2) {
                            afwnVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z) {
                if (iG2 > 0) {
                    this.c = Status.k.withDescription("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.c = Status.k.withDescription("Received unexpected EOS on empty DATA frame from server");
                }
                afih afihVar = new afih();
                this.d = afihVar;
                j(this.c, afof.PROCESSED, false, afihVar);
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = true;
        }
    }

    public final void q(afih afihVar) {
        Status status = this.c;
        if (status != null) {
            this.c = status.a("headers: ".concat(afihVar.toString()));
            return;
        }
        try {
            if (this.f) {
                this.c = Status.k.withDescription("Received headers twice");
            } else {
                Integer num = (Integer) afihVar.a(b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f = true;
                    Status statusF = f(afihVar);
                    this.c = statusF;
                    if (statusF != null) {
                        this.c = statusF.a("headers: ".concat(afihVar.toString()));
                        this.d = afihVar;
                        this.e = s(afihVar);
                        return;
                    }
                    t(afihVar);
                    yqw.M(!this.n, "Received headers on closed stream");
                    for (afjy afjyVar : this.j.b) {
                        ((afev) afjyVar).a();
                    }
                    String str = (String) afihVar.a(afrq.b);
                    if (str == null) {
                        this.k.c(afihVar);
                    } else {
                        affu affuVarA = this.l.a(str);
                        if (affuVarA == null) {
                            b(new afjx(Status.k.withDescription(String.format("Can't find decompressor for %s", str)), null));
                        } else {
                            if (affuVarA != afey.a) {
                                afox afoxVar = this.o;
                                yqw.M(true, "Already set full stream decompressor");
                                ((afvg) afoxVar).c = affuVarA;
                            }
                            this.k.c(afihVar);
                        }
                    }
                }
            }
            Status status2 = this.c;
            if (status2 != null) {
                this.c = status2.a("headers: ".concat(afihVar.toString()));
                this.d = afihVar;
                this.e = s(afihVar);
            }
        } catch (Throwable th) {
            Status status3 = this.c;
            if (status3 != null) {
                this.c = status3.a("headers: ".concat(afihVar.toString()));
                this.d = afihVar;
                this.e = s(afihVar);
            }
            throw th;
        }
    }

    public final void r(afih afihVar) {
        Status statusA;
        Status statusF = this.c;
        if (statusF == null && !this.f) {
            statusF = f(afihVar);
            this.c = statusF;
            if (statusF != null) {
                this.d = afihVar;
            }
        }
        if (statusF != null) {
            Status statusA2 = statusF.a("trailers: ".concat(afihVar.toString()));
            this.c = statusA2;
            c(statusA2, false, this.d);
            return;
        }
        Status status = (Status) afihVar.a(afgv.b);
        if (status != null) {
            statusA = status.withDescription((String) afihVar.a(afgv.a));
        } else if (this.f) {
            statusA = Status.c.withDescription("missing GRPC status in response");
        } else {
            Integer num = (Integer) afihVar.a(b);
            statusA = (num != null ? afrq.a(num.intValue()) : Status.k.withDescription("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
        }
        t(afihVar);
        if (this.n) {
            afmw.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{statusA, afihVar});
            return;
        }
        for (afjy afjyVar : this.j.b) {
        }
        j(statusA, afof.PROCESSED, false, afihVar);
    }
}
