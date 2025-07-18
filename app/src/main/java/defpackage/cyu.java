package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class cyu implements dqe {
    final /* synthetic */ cyg a;
    final /* synthetic */ List b;
    final /* synthetic */ dnv c;
    private boolean d;

    public cyu(cyg cygVar, List list, dnv dnvVar) {
        this.a = cygVar;
        this.b = list;
        this.c = dnvVar;
    }

    @Override // defpackage.dqe
    public final /* bridge */ /* synthetic */ Object a() throws Throwable {
        boolean z;
        dap dkmVar;
        dap djiVar;
        cyu cyuVar = this;
        if (cyuVar.d) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        btt.b("Glide registry");
        cyuVar.d = true;
        try {
            cyg cygVar = cyuVar.a;
            List list = cyuVar.b;
            dnv dnvVar = cyuVar.c;
            ddz ddzVar = cygVar.b;
            ddx ddxVar = cygVar.d;
            cyk cykVar = cygVar.c;
            Context applicationContext = cykVar.getApplicationContext();
            cym cymVar = cykVar.f;
            cyt cytVar = new cyt();
            djo djoVar = new djo();
            dod dodVar = cytVar.g;
            dodVar.b(djoVar);
            dodVar.b(new dkc());
            Resources resources = applicationContext.getResources();
            List listA = cytVar.a();
            try {
                dlw dlwVar = new dlw(applicationContext, listA, ddzVar, ddxVar);
                dlg dlgVar = new dlg(ddzVar, new dle());
                djy djyVar = new djy(cytVar.a(), resources.getDisplayMetrics(), ddzVar, ddxVar);
                if (cymVar.a(cyh.class)) {
                    try {
                        dkmVar = new dkm();
                        djiVar = new dji();
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        cyuVar = this;
                        cyuVar.d = z;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    djiVar = new djh(djyVar);
                    dkmVar = new dkt(djyVar, ddxVar);
                }
                dlm dlmVar = new dlm(new dln(listA, ddxVar));
                doh dohVar = cytVar.c;
                dohVar.c("Animation", dlmVar, InputStream.class, Drawable.class);
                dohVar.c("Animation", new dll(new dln(listA, ddxVar)), ByteBuffer.class, Drawable.class);
                dlr dlrVar = new dlr(applicationContext);
                djd djdVar = new djd(ddxVar);
                dmk dmkVar = new dmk();
                dmn dmnVar = new dmn();
                ContentResolver contentResolver = applicationContext.getContentResolver();
                dfv dfvVar = new dfv();
                doc docVar = cytVar.b;
                docVar.b(ByteBuffer.class, dfvVar);
                docVar.b(InputStream.class, new dhv(ddxVar));
                dohVar.c("Bitmap", djiVar, ByteBuffer.class, Bitmap.class);
                dohVar.c("Bitmap", dkmVar, InputStream.class, Bitmap.class);
                if (dbk.c()) {
                    dohVar.c("Bitmap", new dko(djyVar), ParcelFileDescriptor.class, Bitmap.class);
                }
                dohVar.c("Bitmap", new dlg(ddzVar, new dla()), AssetFileDescriptor.class, Bitmap.class);
                dohVar.c("Bitmap", dlgVar, ParcelFileDescriptor.class, Bitmap.class);
                dia diaVar = dia.a;
                dhi dhiVar = cytVar.a;
                dhiVar.c(Bitmap.class, Bitmap.class, diaVar);
                dohVar.c("Bitmap", new dkx(), Bitmap.class, Bitmap.class);
                doj dojVar = cytVar.d;
                dojVar.b(Bitmap.class, djdVar);
                dohVar.c("BitmapDrawable", new djb(resources, djiVar), ByteBuffer.class, BitmapDrawable.class);
                dohVar.c("BitmapDrawable", new djb(resources, dkmVar), InputStream.class, BitmapDrawable.class);
                dohVar.c("BitmapDrawable", new djb(resources, dlgVar), ParcelFileDescriptor.class, BitmapDrawable.class);
                dojVar.b(BitmapDrawable.class, new djc(ddzVar, djdVar));
                dohVar.c("Animation", new dmj(listA, dlwVar, ddxVar), InputStream.class, dlz.class);
                dohVar.c("Animation", dlwVar, ByteBuffer.class, dlz.class);
                dojVar.b(dlz.class, new dma());
                dhiVar.c(czm.class, czm.class, diaVar);
                dohVar.c("Bitmap", new dmh(ddzVar), czm.class, Bitmap.class);
                dohVar.c("legacy_append", dlrVar, Uri.class, Drawable.class);
                dohVar.c("legacy_append", new dkr(dlrVar, ddzVar), Uri.class, Bitmap.class);
                dlh dlhVar = new dlh();
                dbb dbbVar = cytVar.e;
                dbbVar.b(dlhVar);
                dhiVar.c(File.class, ByteBuffer.class, new dfx());
                dhiVar.c(File.class, InputStream.class, new dgp());
                dohVar.c("legacy_append", new dlt(), File.class, File.class);
                dhiVar.c(File.class, ParcelFileDescriptor.class, new dgl());
                dhiVar.c(File.class, File.class, diaVar);
                dbbVar.b(new dbg(ddxVar));
                if (dbk.c()) {
                    dbbVar.b(new dbj());
                }
                dgf dgfVar = new dgf(applicationContext);
                dgd dgdVar = new dgd(applicationContext);
                dge dgeVar = new dge(applicationContext);
                dhiVar.c(Integer.TYPE, InputStream.class, dgfVar);
                dhiVar.c(Integer.class, InputStream.class, dgfVar);
                dhiVar.c(Integer.TYPE, AssetFileDescriptor.class, dgdVar);
                dhiVar.c(Integer.class, AssetFileDescriptor.class, dgdVar);
                dhiVar.c(Integer.TYPE, Drawable.class, dgeVar);
                dhiVar.c(Integer.class, Drawable.class, dgeVar);
                dhiVar.c(Uri.class, InputStream.class, new dht(applicationContext));
                dhiVar.c(Uri.class, AssetFileDescriptor.class, new dhs(applicationContext));
                dhq dhqVar = new dhq(resources);
                dho dhoVar = new dho(resources);
                dhp dhpVar = new dhp(resources);
                dhiVar.c(Integer.class, Uri.class, dhqVar);
                dhiVar.c(Integer.TYPE, Uri.class, dhqVar);
                dhiVar.c(Integer.class, AssetFileDescriptor.class, dhoVar);
                dhiVar.c(Integer.TYPE, AssetFileDescriptor.class, dhoVar);
                dhiVar.c(Integer.class, InputStream.class, dhpVar);
                dhiVar.c(Integer.TYPE, InputStream.class, dhpVar);
                dhiVar.c(String.class, InputStream.class, new dgb());
                dhiVar.c(Uri.class, InputStream.class, new dgb());
                dhiVar.c(String.class, InputStream.class, new dhy());
                dhiVar.c(String.class, ParcelFileDescriptor.class, new dhx());
                dhiVar.c(String.class, AssetFileDescriptor.class, new dhw());
                dhiVar.c(Uri.class, InputStream.class, new dfm(applicationContext.getAssets()));
                dhiVar.c(Uri.class, AssetFileDescriptor.class, new dfl(applicationContext.getAssets()));
                dhiVar.c(Uri.class, InputStream.class, new dim(applicationContext));
                dhiVar.c(Uri.class, InputStream.class, new dio(applicationContext));
                if (Build.VERSION.SDK_INT >= 29) {
                    dhiVar.c(Uri.class, InputStream.class, new dis(applicationContext));
                    dhiVar.c(Uri.class, ParcelFileDescriptor.class, new dir(applicationContext));
                }
                dhiVar.c(Uri.class, InputStream.class, new dig(contentResolver));
                dhiVar.c(Uri.class, ParcelFileDescriptor.class, new die(contentResolver));
                dhiVar.c(Uri.class, AssetFileDescriptor.class, new did(contentResolver));
                dhiVar.c(Uri.class, InputStream.class, new dii());
                dhiVar.c(URL.class, InputStream.class, new div());
                dhiVar.c(Uri.class, File.class, new dgw(applicationContext));
                dhiVar.c(dgr.class, InputStream.class, new dik());
                dhiVar.c(byte[].class, ByteBuffer.class, new dfp());
                dhiVar.c(byte[].class, InputStream.class, new dft());
                dhiVar.c(Uri.class, Uri.class, diaVar);
                dhiVar.c(Drawable.class, Drawable.class, diaVar);
                dohVar.c("legacy_append", new dls(), Drawable.class, Drawable.class);
                dml dmlVar = new dml(resources);
                dmq dmqVar = cytVar.f;
                dmqVar.c(Bitmap.class, BitmapDrawable.class, dmlVar);
                dmqVar.c(Bitmap.class, byte[].class, dmkVar);
                dmqVar.c(Drawable.class, byte[].class, new dmm(ddzVar, dmkVar, dmnVar));
                dmqVar.c(dlz.class, byte[].class, dmnVar);
                dlg dlgVar2 = new dlg(ddzVar, new dlc());
                dohVar.c("legacy_append", dlgVar2, ByteBuffer.class, Bitmap.class);
                dohVar.c("legacy_append", new djb(resources, dlgVar2), ByteBuffer.class, BitmapDrawable.class);
                cyv.a(applicationContext, cygVar, cytVar, list, dnvVar);
                this.d = false;
                Trace.endSection();
                return cytVar;
            } catch (Throwable th2) {
                th = th2;
                cyuVar = this;
                z = false;
                cyuVar.d = z;
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
