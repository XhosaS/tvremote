package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v7.appcompat.R;
import android.view.View;
import android.view.Window;
import java.io.File;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sis {
    public static String a;
    public static String b;

    public static File a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static double b(double d, double d2) {
        return c(srz.e(d), srz.e(d2));
    }

    public static double c(double d, double d2) {
        double dMax = Math.max(d, d2);
        double d3 = dMax + 5.0d;
        if (dMax != d2) {
            d = d2;
        }
        return d3 / (d + 5.0d);
    }

    public static void d(Context context, int i) {
        View viewPeekDecorView;
        Context context2;
        context.getTheme().applyStyle(i, true);
        Window window = ((Activity) context).getWindow();
        Resources.Theme theme = null;
        if (window != null && (viewPeekDecorView = window.peekDecorView()) != null && (context2 = viewPeekDecorView.getContext()) != null) {
            theme = context2.getTheme();
        }
        if (theme != null) {
            theme.applyStyle(i, true);
        }
    }

    public static Object e(Context context, Class cls) {
        Object applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof xci)) {
            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
        }
        try {
            return cls.cast(((xci) applicationContext).a());
        } catch (ClassCastException e) {
            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
        }
    }

    public static Class f(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return f(((ParameterizedType) type).getRawType());
        }
        if (type instanceof GenericArrayType) {
            return f(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length > 0) {
                return f(upperBounds[0]);
            }
        } else if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                return f(bounds[0]);
            }
        }
        throw new IllegalArgumentException("Can't extract class: ".concat(String.valueOf(String.valueOf(type.getClass()))));
    }

    public static int g(int i) {
        if (i == 0) {
            return 18;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 8) {
                        return 4;
                    }
                    if (i == 9) {
                        return 5;
                    }
                    if (i == 40) {
                        return 14;
                    }
                    if (i == 50) {
                        return 15;
                    }
                    if (i == 60) {
                        return 16;
                    }
                    if (i == 70) {
                        return 17;
                    }
                    switch (i) {
                        case 20:
                            return 6;
                        case 21:
                            return 7;
                        case 22:
                            return 8;
                        case 23:
                            return 9;
                        case 24:
                            return 10;
                        default:
                            switch (i) {
                                case 29:
                                    return 11;
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                    return 12;
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                    return 13;
                                default:
                                    return 0;
                            }
                    }
                }
            }
        }
        return i2;
    }
}
