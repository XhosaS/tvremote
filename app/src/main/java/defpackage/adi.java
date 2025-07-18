package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adi {
    public static Icon a(IconCompat iconCompat, Context context) throws FileNotFoundException {
        Icon iconCreateWithBitmap;
        String resPackage;
        int i = iconCompat.b;
        switch (i) {
            case -1:
                return (Icon) iconCompat.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                if (i == -1) {
                    resPackage = ((Icon) iconCompat.c).getResPackage();
                } else {
                    if (i != 2) {
                        Objects.toString(iconCompat);
                        throw new IllegalStateException("called getResPackage() on ".concat(iconCompat.toString()));
                    }
                    String str = iconCompat.k;
                    resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.c).split(":", -1)[0] : iconCompat.k;
                }
                iconCreateWithBitmap = Icon.createWithResource(resPackage, iconCompat.f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.c);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(iconCompat.c());
                    break;
                } else {
                    if (context == null) {
                        Uri uriC = iconCompat.c();
                        Objects.toString(uriC);
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(uriC)));
                    }
                    Uri uriC2 = iconCompat.c();
                    String scheme = uriC2.getScheme();
                    InputStream inputStreamOpenInputStream = null;
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriC2);
                        } catch (Exception e) {
                            Objects.toString(uriC2);
                            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(uriC2)), e);
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.c));
                        } catch (FileNotFoundException e2) {
                            Objects.toString(uriC2);
                            Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(uriC2)), e2);
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        Uri uriC3 = iconCompat.c();
                        Objects.toString(uriC3);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(uriC3)));
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode != IconCompat.a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}
