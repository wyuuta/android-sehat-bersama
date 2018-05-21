package com.example.yuuta.sehatbersama.Object

class CourseList {
    companion object {
        fun getCourseList(): ArrayList<Course> {
            val courses = ArrayList<Course>()
            // 0
            courses.add(Course(
                    "Jumping Jacks",
                    "Start your feet together and your arms by your sides, then jump up with your feet apart and your hands overhead.\n" +
                            "Return to the start position then do the next rep. This exercise provides a full-body wokout and works all your large muscle groups.",
                    "x 30"
            ))
            // 1
            courses.add(Course(
                    "Incline Push-ups",
                    "Start in regular push-up positions but with your hands elevated on a chair or bench.\n" +
                            "Then push your body up down using your arm strength.\n" +
                            "Remember to keep your body straight.",
                    "x 16"
            ))
            // 2
            courses.add(Course(
                    "Knee Push-ups",
                    "Start in the regular push-up position, then let your knees touch the floor and raise your feet up off the floor.\n" +
                            "Nexxt push your body up and down.",
                    "x 12"
            ))
            // 3
            courses.add(Course(
                    "Push-ups",
                    "Lay prone on the ground witth arms supporting your body.\n" +
                            "Keep your body straight while raising and lowering your body with your arms.\n" +
                            "This exercise works the chest, shoulders, triceps, back and legs.",
                    "x 10"
            ))
            // 4
            courses.add(Course(
                    "Wide Arm Push-ups",
                    "Start in the regular push-up position but with your hands spread wider than your shoulders.\n" +
                            "Then push your body up dan down. Remember to keep your body straight.",
                    "x 10"
            ))
            // 5
            courses.add(Course(
                    "Incline Push-ups",
                    "Start in the regular push-up position but with your hands elevated on a chair or bench.\n" +
                            "Then push your body up down using your arm strength.\n" +
                            "Remember to keep your body straight",
                    "x 12"
            ))
            // 6
            courses.add(Course(
                    "Box Push-ups",
                    "Start on all fours with your knees under your butt and your hands directly under your shoulders." +
                            "Bend your elbows and do a push-up. Return to the start position and repeat.",
                    "x 12"
            ))
            // 7
            courses.add(Course(
                    "Hindu Push-ups",
                    "Start with your hands and feet touching the floor, body bent and butt up in an upside down 'V' shape.\n" +
                            "Then bend your elbows to bring your body towards the floor.\n" +
                            "When your body is close to the floor, raise your upper body up as far as possible. Then return to the original position and repeat.",
                    "x 10"
            ))
            // 8
            courses.add(Course(
                    "Cobra Stretch",
                    "Lie down on your stomach and bend your elbows with your hands beneath your shoulders.\n" +
                            "Then push your chest up off the ground as far as possible. Hold this position for seconds.",
                    "00:20"
            ))
            // 9
            courses.add(Course(
                    "Chest Stretch",
                    "Find a doorway, take a lunge position in the doorway with your arms on the door frame and your elbows a little lower than your shoulders, then slowly bring your chest forward\n" +
                            "Hold this position for 30-40 seconds. Then slowly come out of it, bring your arms down and do a couple of shoulder rolls.\n" +
                            "Don't pull your head forward, and keep your neck relaxed.",
                    "00:20"
            ))
            // 10
            courses.add(Course(
                    "Abdominal Crunches",
                    "Lie on your back with your knees bent and your arms stretched forward.\n" +
                            "Then lift your upper body off the floor. Hold for a few seconds and slowly return.\n" +
                            "It primarily works the rectus abdominis muscle and the obliques.",
                    "x 16"
            ))
            // 11
            courses.add(Course(
                    "Russian Twist",
                    "Sit on the floor with your knees bent, feet lifted a little bit and back tilted backwards.\n" +
                            "Then hold your hands together and twist from side to side.",
                    "x 16"
            ))
            // 12
            courses.add(Course(
                    "Heel Touch",
                    "Lie on the ground with your legs bent and your arms by your sides.\n" +
                            "Slightly lift your upper body off the floor and make your hands alternately reach your heels.",
                    "x 20"
            ))
            // 13
            courses.add(Course(
                    "Leg Raises",
                    "Lie down on your back, and put your hands beneath your hips for support.\n" +
                            "Then lift your legs up until they form a right angle with the floor.\n" +
                            "Slowly bring your legs back down and repeat the exercise.",
                    "x 16"
            ))
            // 14
            courses.add(Course(
                    "Plank",
                    "Lie on the floor with your toes and forearms on the ground. Keep your body straight and hold this position as long as you can.\n" +
                            "This exercise strengthens the abdomen, back and shoulders.",
                    "00:20"
            ))
            // 15
            courses.add(Course(
                    "Mountain Climber",
                    "Start in the push-up position. Bend your right knee towards your chest and keep your left leg straight, then quickly switch from one leg to the other.\n" +
                            "This exercise strengthens multiple muscle groups.",
                    "x 12"
            ))
            // 16
            courses.add(Course(
                    "Cobra Stretch",
                    "Lie down on your stomach and bend your elbows with your hands beneath your shoulders.\n" +
                            "Then push your chest up off the ground as far as possible. Hold this position for seconds.",
                    "00:30"
            ))
            // 17
            courses.add(Course(
                    "Spine Lumbar Twist Stretch Left",
                    "Lie on your back with your legs extended.\n" +
                            "Lift your left leg up and use your right hand to pull your left knee to the right, but keep your other arm extended to the side on the floor.\n" +
                            "Hold this position for a few seconds.",
                    "00:30"
            ))
            // 18
            courses.add(Course(
                    "Spine Lumbar Twist Stretch Right",
                    "Lie on your back with your legs extended.\n" +
                            "Lift your right leg up and use your left hand to pull your right knee to the left, but keep your other arm extended to the side on the floor.\n" +
                            "Hold this position for a few seconds.",
                    "00:30"
            ))
            // 19
            courses.add(Course(
                    "Arm Raises",
                    "Stand on the floor with your arms extended straight forward at shoulder height.\n" +
                            "Raise your arms above your head. Return to the start position and repeat.",
                    "00:30"
            ))
            // 20
            courses.add(Course(
                    "Side Arm Raise",
                    "Stand with your feet shoulder width apart.\n" +
                            "Raise your arms to the sides at shoulder height, then put them down.\n" +
                            "Repeat the exercise. Keep your arms straight during the exercise.",
                    "00:30"
            ))
            // 21
            courses.add(Course(
                    "Triceps Dips",
                    "For the start position, sit on the chair. Then move your hip off the chair with your hands holding the edge of the chair.\n" +
                            "Slowly bend and stretch your arms to make your body go up and down. This is a great exercise for the triceps.",
                    "x 10"
            ))
            // 22
            courses.add(Course(
                    "Arm Circles Clockwise",
                    "Stand on the floor with your arms extended straight out to the sides at shoulder height.\n" +
                            "Move your arms clockwise in circles fast.\n" +
                            "Try to do it as fast as you can.\n" +
                            "It's a great exercise for the deltoid muslce.",
                    "00:30"
            ))
            // 23
            courses.add(Course(
                    "Arm Circles Counterclockwise",
                    "Stand on the floor with your arms extended straight out to the sides at shoulder height.\n" +
                            "Move your arms counterclockwise in circles fast.\n" +
                            "Try to do it as fast as you can.\n" +
                            "It's a great exercise for the deltoid muscle.",
                    "00:30"
            ))
            // 24
            courses.add(Course(
                    "Diamond Push-ups",
                    "Start on all fours with your knees under your butt and your hands under your shoulders.\n" +
                            "Make a diamond shape with your forefingers and thumbs together directly under your face, then push your body up and down.\n" +
                            "Remember to keep your body straight.",
                    "x 6"
            ))
            // 25
            courses.add(Course(
                    "Chest Press Pulse",
                    "Hold your forearms together at shoulder height and bend your elbows with your hands together to make an 'L' shape.\n" +
                            "Then lift your forearms up and down.",
                    "x 15"
            ))
            // 26
            courses.add(Course(
                    "Leg Barbell Curl Left",
                    "Stand against a wall. Lift your right leg up, lean forward and grab underneath your right ankle with your left hand.\n" +
                            "Bring the ankle up towards the shoulder as much as you can, then lower it and repeat the exercise.",
                    "x 8"
            ))
            // 27
            courses.add(Course(
                    "Leg Barbell Curl Right",
                    "Stand against a wall. Lift your left leg up, lean forward and grab underneath your left ankle with your right hand.\n" +
                            "Bring the ankle up towards the shoulder as much as you can, then lower it and repeat the exercise.",
                    "x 8"
            ))
            // 28
            courses.add(Course(
                    "Diagonal Plank",
                    "Start in the straight arm plank position.\n" +
                            "Lift your right arm and left leg until they are parallel with the ground.\n" +
                            "Return to the start position and repeat with the other side.",
                    "x 10"
            ))
            // 29
            courses.add(Course(
                    "Punches",
                    "Stand with your legs shoulder width apart and your knees bent slightly.\n" +
                            "Bend your elbows and clench your fists in front of your face.\n" +
                            "Extend one arm forward with the palm facong the floor.\n" +
                            "Take the arm back and repeat with the other arm.",
                    "00:30"
            ))
            // 30
            courses.add(Course(
                    "Inchworms",
                    "Start with your feet shoulder width apart.\n" +
                            "Bend your boddy and walk your hands in front of you as far as you can, then walk your hands back. Repeat the exercise.",
                    "x 8"
            ))
            // 31
            courses.add(Course(
                    "Wall Push-ups",
                    "Stand in front of a wall one big step away from it. Then put your hands out straight towards the wall and lean against it.\n" +
                            "Slowly bend your elbows and press your upper body towards the wall. Push back and repeat the exercise.\n" +
                            "Remember to keep your body straight.",
                    "x 12"
            ))
            // 32
            courses.add(Course(
                    "Triceps Stretch Left",
                    "Put your left hand on your back, use your right hand to grab your left elbow and gently pull it. Hol this position for a few seconds.",
                    "00:30"
            ))
            // 33
            courses.add(Course(
                    "Triceps Stretch Right",
                    "Put your right hand on your back, use your left hand to grab your right elbow and gently pull it. Hol this position for a few seconds.",
                    "00:30"
            ))
            // 34
            courses.add(Course(
                    "Standing Biceps Stretch Left",
                    "Stand with your left arm close to a wall. Extend your left arm and put your left hand on the wall, then gently turn your body on the right.",
                    "00:30"
            ))
            // 35
            courses.add(Course(
                    "Standing Biceps Stretch Right",
                    "Stand with your right arm close to a wall. Extend your right arm and put your right hand on the wall, then gently turn your body on the left.",
                    "00:30"
            ))
            // 36
            courses.add(Course(
                    "Side hop",
                    "Stand on the floor, put your hands in front of you and hop from side to side",
                    "00:30"
            ))
            // 37
            courses.add(Course(
                    "Squats",
                    "Stand with your feet shoulder width apart and your arms stretched forward, then lower your body until your thighs are parallel with the floor.\n" +
                            "Your knees should be extended in the same direction as your toes. Return to the start position and do the enxt rep.\n" +
                            "This works the thighs, hips buttocks, quads, hamstrings and lower body.",
                    "x 12"
            ))
            // 38
            courses.add(Course(
                    "Side-lying leg lift left",
                    "Lie down on your side with your head rested on your right arm. Lift your upper leg up and return to the start position.\n" +
                            "Make sure your left leg goes straight up and down during the exercise.\n" +
                            "It's a great exercise for the gluteus.",
                    "x 12"
            ))
            // 39
            courses.add(Course(
                    "Side-lying leg lift right",
                    "Lie down on your side with your head rested on your left arm. Lift your upper leg up and return to the start position.\n" +
                            "Make sure your right leg goes straight up and down during the exercise.\n" +
                            "It's a great exercise for the gluteus.",
                    "x 12"
            ))
            // 40
            courses.add(Course(
                    "Backward Lunge",
                    "Stand with your feet shoulder width apart anda your hands on your hips.\n" +
                            "Step a big step backward with your right leg and lower your body until your left rhigh is parallel to the floor. Return and repeat with the other side.",
                    "x 14"
            ))
            // 41
            courses.add(Course(
                    "Donkey Kicks Left",
                    "Stand on all fours with your knees under your butt and your hands under your shoulders.\n" +
                            "Then lift your left leg and squeeze your butt as much as you can. Go back to the start position and repeat the exercise.",
                    "x 15"
            ))
            // 42
            courses.add(Course(
                    "Donkey Kicks Right",
                    "Stand on all fours with your knees under your butt and your hands under your shoulders.\n" +
                            "Then lift your right leg and squeeze your butt as much as you can. Go back to the start position and repeat the exercise.",
                    "x 15"
            ))
            // 43
            courses.add(Course(
                    "Left Quad Stretch With Wall",
                    "Stand with your right hand on the wall. Bend your left leg and grasp your ankle or toes to bring your left calf close to your left thigh. Hold this position",
                    "00:30"
            ))
            // 44
            courses.add(Course(
                    "Right Quad Stretch With Wall",
                    "Stand with your left hand on the wall. Bend your right leg and grasp your ankle or toes to bring your right calf close to your right thigh. Hold this position",
                    "00:30"
            ))
            return courses
        }

        const val WORKOUT_ID = "workout_id"
    }
}