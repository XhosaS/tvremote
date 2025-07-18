package defpackage;

import android.content.Context;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaxd implements zxe {
    final /* synthetic */ aaxz a;
    final /* synthetic */ aaxe b;

    public aaxd(aaxe aaxeVar, aaxz aaxzVar) {
        this.a = aaxzVar;
        this.b = aaxeVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }

    @Override // defpackage.zxe
    public final /* synthetic */ void b(Object obj) {
        aaxz aaxzVar = this.a;
        String str = (String) obj;
        zpr zprVar = aaxzVar.g;
        if (zprVar == null) {
            zprVar = zpr.a;
        }
        aaxe aaxeVar = this.b;
        String str2 = zprVar.j;
        Charset charset = aaww.a;
        int i = zjr.b;
        int i2 = ((zjl) zjy.a.a(str2, aaww.a)).a;
        aaxf aaxfVar = aaxeVar.c;
        kak kakVar = aaxfVar.b;
        Context context = aaxfVar.a;
        jyv jyvVarI = kakVar.a(context, "CLIENT_LOGGING_PROD", str).i(aaxzVar, mhm.b(context, new aejp()));
        aecc aeccVar = jyvVarI.b;
        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar.y();
        }
        aecd aecdVar = (aecd) aeccVar.b;
        aecd aecdVar2 = aecd.a;
        aecdVar.b |= 32;
        aecdVar.e = i2;
        zyd zydVarA = otn.a(jyvVarI.d());
        yqj yqjVar = new yqj();
        zwk zwkVar = zwk.a;
        final zyd zydVarG = zuz.g(zydVarA, yqjVar, zwkVar);
        zydVarG.d(new Runnable() { // from class: aaxa
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = aaxf.c;
                if (((zuv) zydVarG).valueField instanceof zue) {
                    Log.d("ClientLoggingBackend", "Log cancelled. The app has crashed.");
                }
            }
        }, zwkVar);
        zud.g(zydVarG, Exception.class, wyo.a(new yqi() { // from class: aaxb
            @Override // defpackage.yqi
            public final Object apply(Object obj2) {
                int i3 = aaxf.c;
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj2);
                return null;
            }
        }), zwkVar);
    }
}
