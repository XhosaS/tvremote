package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afna implements afzx {
    public static final Logger t = Logger.getLogger(afna.class.getName());

    @Override // defpackage.afzx
    public final void c() {
        afvk afvkVar;
        agaf agafVar;
        if (((afvk) l()).i || (agafVar = (afvkVar = (afvk) l()).b) == null || agafVar.a() <= 0) {
            return;
        }
        afvkVar.a(false, true);
    }

    @Override // defpackage.afzx
    public final void d() {
        j().n();
    }

    @Override // defpackage.afzx
    public final void e(int i) {
        afmz afmzVarJ = j();
        afox afoxVar = afmzVarJ.o;
        int i2 = agfd.a;
        afmzVarJ.e(new afmy(afmzVarJ, i));
    }

    @Override // defpackage.afzx
    public final void f(affa affaVar) {
        afrh afrhVarL = l();
        affaVar.getClass();
        ((afvk) afrhVarL).d = affaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afzx
    public final void h(InputStream inputStream) throws IOException {
        int iA;
        try {
            if (!((afvk) l()).i) {
                afrh afrhVarL = l();
                if (((afvk) afrhVarL).i) {
                    throw new IllegalStateException("Framer already closed");
                }
                ((afvk) afrhVarL).j++;
                ((afvk) afrhVarL).k++;
                ((afvk) afrhVarL).l = 0L;
                for (afjy afjyVar : ((afvk) afrhVarL).h.b) {
                }
                affa affaVar = ((afvk) afrhVarL).d;
                afez afezVar = afey.a;
                try {
                    try {
                        try {
                            int iAvailable = inputStream.available();
                            if (iAvailable != 0 && affaVar != afezVar) {
                                afvh afvhVar = new afvh((afvk) afrhVarL);
                                OutputStream outputStreamB = ((afvk) afrhVarL).d.b(afvhVar);
                                try {
                                    iA = inputStream.a(outputStreamB);
                                    outputStreamB.close();
                                    int i = ((afvk) afrhVarL).a;
                                    if (i >= 0 && iA > i) {
                                        throw new afjx(Status.h.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(((afvk) afrhVarL).a))), null);
                                    }
                                    ((afvk) afrhVarL).b(afvhVar, true);
                                } catch (Throwable th) {
                                    outputStreamB.close();
                                    throw th;
                                }
                            } else if (iAvailable != -1) {
                                ((afvk) afrhVarL).l = iAvailable;
                                int i2 = ((afvk) afrhVarL).a;
                                if (i2 >= 0 && iAvailable > i2) {
                                    throw new afjx(Status.h.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(((afvk) afrhVarL).a))), null);
                                }
                                ByteBuffer byteBuffer = ((afvk) afrhVarL).f;
                                byteBuffer.clear();
                                byteBuffer.put((byte) 0).putInt(iAvailable);
                                ((afvk) afrhVarL).c = iAvailable + 5;
                                ((afvk) afrhVarL).c(byteBuffer.array(), 0, byteBuffer.position());
                                iA = inputStream.a(((afvk) afrhVarL).e);
                            } else {
                                afvh afvhVar2 = new afvh((afvk) afrhVarL);
                                iA = inputStream.a(afvhVar2);
                                ((afvk) afrhVarL).b(afvhVar2, false);
                            }
                            if (iAvailable != -1 && iA != iAvailable) {
                                throw new afjx(Status.k.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(iA), Integer.valueOf(iAvailable))), null);
                            }
                            afzw afzwVar = ((afvk) afrhVarL).h;
                            afzwVar.g();
                            afzwVar.c(((afvk) afrhVarL).l);
                            for (afjy afjyVar2 : afzwVar.b) {
                            }
                        } catch (afjx e) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        throw new afjx(Status.k.withDescription("Failed to frame message").c(e2), null);
                    }
                } catch (RuntimeException e3) {
                    throw new afjx(Status.k.withDescription("Failed to frame message").c(e3), null);
                }
            }
        } finally {
            afrq.h(inputStream);
        }
    }

    @Override // defpackage.afzx
    public boolean i() {
        throw null;
    }

    public abstract afmz j();

    protected abstract afrh l();
}
