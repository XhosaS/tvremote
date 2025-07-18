package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csz extends ctc {
    private static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private static final Font h(FontFamily fontFamily, int i) {
        int i2 = 1;
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iG = g(fontStyle, font.getStyle());
        while (i2 < fontFamily.getSize()) {
            Font font2 = fontFamily.getFont(i2);
            int iG2 = g(fontStyle, font2.getStyle());
            int i3 = iG2 < iG ? iG2 : iG;
            if (iG2 < iG) {
                font = font2;
            }
            i2++;
            iG = i3;
        }
        return font;
    }

    private static FontFamily i(cty[] ctyVarArr, ContentResolver contentResolver) throws IOException {
        FontFamily.Builder builder = null;
        for (cty ctyVar : ctyVarArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(ctyVar.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(ctyVar.c).setSlant(ctyVar.d ? 1 : 0).setTtcIndex(ctyVar.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    continue;
                }
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // defpackage.ctc
    public final Typeface a(Context context, cty[] ctyVarArr, int i) {
        try {
            FontFamily fontFamilyI = i(ctyVarArr, context.getContentResolver());
            if (fontFamilyI == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyI).setStyle(h(fontFamilyI, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ctc
    public final Typeface b(Context context, cvw cvwVar, Resources resources, int i) throws IOException {
        try {
            Object obj = cvwVar.a;
            int length = ((csi[]) obj).length;
            FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                csi csiVar = ((csi[]) obj)[i2];
                try {
                    Font fontBuild = new Font.Builder(resources, csiVar.f).setWeight(csiVar.b).setSlant(csiVar.c ? 1 : 0).setTtcIndex(csiVar.e).setFontVariationSettings(csiVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ctc
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ctc
    public final Typeface f(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyI = i((cty[]) list.get(0), contentResolver);
            if (fontFamilyI == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyI);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyI2 = i((cty[]) list.get(i2), contentResolver);
                if (fontFamilyI2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyI2);
                }
            }
            return customFallbackBuilder.setStyle(h(fontFamilyI, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.ctc
    protected final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.ctc
    protected final cty m(cty[] ctyVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
