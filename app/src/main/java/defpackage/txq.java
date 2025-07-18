package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txq {
    public final Context a;
    public final zyh b;

    public txq(Context context, zyh zyhVar) {
        this.a = context;
        this.b = zyhVar;
    }

    public final /* synthetic */ zyd a(final String str) {
        ((zdv) ((zdv) ttp.a.d()).q("com/google/android/libraries/speech/transcription/recognition/LanguagePackDirGenerator", "getLanguagePackInfo", 31, "LanguagePackDirGenerator.java")).u("#getLanguagePackInfo applicationDomain not supported, ignore domain.");
        return this.b.submit(wyo.i(new Callable() { // from class: txp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() throws tro, FileNotFoundException {
                String path = this.a.a.getDir("g3_models", 0).getPath();
                String str2 = str;
                String path2 = new File(path, str2).getPath();
                try {
                    txt txtVar = txt.a;
                    txs txsVar = new txs();
                    yyk yykVar = mbq.b;
                    if (mbq.a(path2)) {
                        zdm zdmVarListIterator = yykVar.listIterator(0);
                        while (zdmVarListIterator.hasNext()) {
                            String path3 = new File((String) zdmVarListIterator.next(), str2).getPath();
                            if (!mbq.a(path3)) {
                                ((zdv) ((zdv) mbq.a.b()).q("com/google/android/libraries/assistant/soda/SodaDetectionHandlerUtils", "getSodaResourceDir", 52, "SodaDetectionHandlerUtils.java")).F("LP directory (%s) is empty. Using LP from sysimg (%s).", path2, path3);
                                path2 = path3;
                            }
                        }
                        throw new FileNotFoundException("No language pack found!");
                    }
                    if ((txsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        txsVar.y();
                    }
                    txt txtVar2 = (txt) txsVar.b;
                    path2.getClass();
                    txtVar2.b |= 2;
                    txtVar2.d = path2;
                    return yyr.k(str2, (txt) txsVar.v());
                } catch (FileNotFoundException unused) {
                    throw new tro(adsg.INVALID_CONFIG);
                }
            }
        }));
    }
}
