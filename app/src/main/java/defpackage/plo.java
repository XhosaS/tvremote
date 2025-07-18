package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plo implements plh {
    public final ueg a;
    private final Executor b;

    public plo(ueg uegVar, Executor executor) {
        this.a = uegVar;
        this.b = executor;
    }

    @Override // defpackage.plh
    public final zyd a(final plg plgVar) {
        plb plbVar = (plb) plgVar;
        String str = plbVar.b;
        if (str.startsWith("inlinefile")) {
            final pli pliVar = (pli) plbVar.f.c();
            zvh zvhVar = new zvh() { // from class: pln
                @Override // defpackage.zvh
                public final zyd a() throws IOException {
                    InputStream inputStreamL;
                    plg plgVar2 = plgVar;
                    pli pliVar2 = pliVar;
                    try {
                        int iD = pliVar2.a().d();
                        int i = iD - 1;
                        if (iD == 0) {
                            throw null;
                        }
                        plo ploVar = this.a;
                        if (i == 0) {
                            inputStreamL = pliVar2.a().b().l();
                        } else if (i == 1) {
                            inputStreamL = (InputStream) ploVar.a.c(pliVar2.a().a(), new uhi());
                        } else {
                            if (i != 2) {
                                throw new RuntimeException(null, null);
                            }
                            inputStreamL = pliVar2.a().c();
                        }
                        try {
                            OutputStream outputStream = (OutputStream) ploVar.a.c(((plb) plgVar2).a, new uhn());
                            try {
                                zkn.a(inputStreamL, outputStream);
                                outputStream.flush();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStreamL != null) {
                                    inputStreamL.close();
                                }
                                return zxy.a;
                            } finally {
                            }
                        } finally {
                        }
                    } catch (IOException e) {
                        qce.g(e, "%s: Unable to copy file content.", "InlineFileDownloader");
                        pha phaVarA = phc.a();
                        phaVarA.c = e;
                        phaVarA.a = phb.INLINE_FILE_IO_ERROR;
                        return zxn.g(phaVarA.a());
                    }
                }
            };
            return zxn.l(wyo.b(zvhVar), this.b);
        }
        qce.d("%s: Invalid url given, expected to start with 'inlinefile:', but was %s", "InlineFileDownloader", str);
        pha phaVarA = phc.a();
        phaVarA.a = phb.INVALID_INLINE_FILE_URL_SCHEME;
        phaVarA.b = "InlineFileDownloader only supports copying inlinefile: scheme";
        return zxn.g(phaVarA.a());
    }
}
