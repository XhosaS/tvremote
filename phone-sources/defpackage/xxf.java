package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class xxf extends xul {
    private static final xrf a;
    private static final xsj b;
    private xtk c;
    private xsm d;
    private Charset e;
    private boolean f;

    static {
        xxe xxeVar = new xxe(0);
        a = xxeVar;
        b = xrg.a(":status", xxeVar);
    }

    protected xxf(int i, ybs ybsVar, ybx ybxVar) {
        super(i, ybsVar, ybxVar);
        this.e = StandardCharsets.UTF_8;
    }

    private static Charset f(xsm xsmVar) {
        String str = (String) xsmVar.c(xxc.g);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void q(xsm xsmVar) {
        xsmVar.f(b);
        xsmVar.f(xrh.b);
        xsmVar.f(xrh.a);
    }

    private static final xtk r(xsm xsmVar) {
        char cCharAt;
        Integer num = (Integer) xsmVar.c(b);
        if (num == null) {
            return xtk.j.e("Missing HTTP status code");
        }
        String str = (String) xsmVar.c(xxc.g);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return xxc.a(num.intValue()).a("invalid content-type: ".concat(String.valueOf(str)));
    }

    protected abstract void c(xtk xtkVar, boolean z, xsm xsmVar);

    protected final void n(yaf yafVar, boolean z) {
        xtk xtkVar = this.c;
        boolean z2 = false;
        if (xtkVar != null) {
            Charset charset = this.e;
            yaf yafVar2 = yaj.a;
            charset.getClass();
            int iF = yafVar.f();
            byte[] bArr = new byte[iF];
            yafVar.k(bArr, 0, iF);
            this.c = xtkVar.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            yafVar.close();
            if (this.c.o.length() > 1000 || z) {
                c(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            yafVar.close();
            c(xtk.j.e("headers not received before payload"), false, new xsm());
            return;
        }
        int iF2 = yafVar.f();
        boolean z3 = true;
        try {
            if (this.t) {
                xuj.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                yafVar.close();
            } else {
                try {
                    xvy xvyVar = this.j;
                    try {
                        if (((xzi) xvyVar).b() || ((xzi) xvyVar).f) {
                            yafVar.close();
                        } else {
                            ((xzi) xvyVar).d.h(yafVar);
                            try {
                                ((xzi) xvyVar).a();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                                if (z3) {
                                    yafVar.close();
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
                            yafVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z) {
                if (iF2 > 0) {
                    this.c = xtk.j.e("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.c = xtk.j.e("Received unexpected EOS on empty DATA frame from server");
                }
                xsm xsmVar = new xsm();
                this.d = xsmVar;
                k(this.c, false, xsmVar);
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(xsm xsmVar) {
        xtk xtkVar = this.c;
        if (xtkVar != null) {
            this.c = xtkVar.a("headers: ".concat(xsmVar.toString()));
            return;
        }
        try {
            if (this.f) {
                this.c = xtk.j.e("Received headers twice");
            } else {
                Integer num = (Integer) xsmVar.c(b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f = true;
                    xtk xtkVarR = r(xsmVar);
                    this.c = xtkVarR;
                    if (xtkVarR != null) {
                        this.c = xtkVarR.a("headers: ".concat(xsmVar.toString()));
                        this.d = xsmVar;
                        this.e = f(xsmVar);
                        return;
                    }
                    q(xsmVar);
                    sij.x(!this.t, "Received headers on closed stream");
                    for (ykn yknVar : this.p.b) {
                        ((xqe) yknVar).a();
                    }
                    String str = (String) xsmVar.c(xxc.b);
                    if (str == null) {
                        this.q.c(xsmVar);
                    } else {
                        xqr xqrVar = (xqr) this.r.c.get(str);
                        xqg xqgVar = xqrVar != null ? xqrVar.b : null;
                        if (xqgVar == null) {
                            b(new xtn(xtk.j.e(String.format("Can't find decompressor for %s", str))));
                        } else {
                            if (xqgVar != xqf.a) {
                                xvy xvyVar = this.j;
                                sij.x(true, "Already set full stream decompressor");
                                ((xzi) xvyVar).c = xqgVar;
                            }
                            this.q.c(xsmVar);
                        }
                    }
                }
            }
            xtk xtkVar2 = this.c;
            if (xtkVar2 != null) {
                this.c = xtkVar2.a("headers: ".concat(xsmVar.toString()));
                this.d = xsmVar;
                this.e = f(xsmVar);
            }
        } catch (Throwable th) {
            xtk xtkVar3 = this.c;
            if (xtkVar3 != null) {
                this.c = xtkVar3.a("headers: ".concat(xsmVar.toString()));
                this.d = xsmVar;
                this.e = f(xsmVar);
            }
            throw th;
        }
    }

    public final void p(xsm xsmVar) throws Throwable {
        xtk xtkVarA;
        xtk xtkVarR = this.c;
        if (xtkVarR == null && !this.f) {
            xtkVarR = r(xsmVar);
            this.c = xtkVarR;
            if (xtkVarR != null) {
                this.d = xsmVar;
            }
        }
        if (xtkVarR != null) {
            xtk xtkVarA2 = xtkVarR.a("trailers: ".concat(xsmVar.toString()));
            this.c = xtkVarA2;
            c(xtkVarA2, false, this.d);
            return;
        }
        xtk xtkVar = (xtk) xsmVar.c(xrh.b);
        if (xtkVar != null) {
            xtkVarA = xtkVar.e((String) xsmVar.c(xrh.a));
        } else if (this.f) {
            xtkVarA = xtk.d.e("missing GRPC status in response");
        } else {
            Integer num = (Integer) xsmVar.c(b);
            xtkVarA = (num != null ? xxc.a(num.intValue()) : xtk.j.e("missing HTTP status code")).a("missing GRPC status, inferred error from HTTP status code");
        }
        q(xsmVar);
        if (this.t) {
            xuj.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{xtkVarA, xsmVar});
            return;
        }
        for (ykn yknVar : this.p.b) {
        }
        k(xtkVarA, false, xsmVar);
    }
}
