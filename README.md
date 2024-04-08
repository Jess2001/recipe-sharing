A recipe sharing web application using ANGULAR 17 , SPRINGBOOT and SQL .
#Spring Data JPA fordatabase connection
#Java 17 v.
#maven

Functional Requirements:

    1. User Registration and Authentication: 
        a. The app should have a user registration feature where users can create an account by providing necessary details such as name, email, and password.
        b. Users should be able to log in securely using their registered email and password.
        c. The app should provide appropriate error handling for incorrect login credentials and display relevant messages to the user.
Note: No API is required here for login or registration. Just allow the user through if validation is successful.
        d. Enable users to view and update their account information including contact details platform.

    2. Recipe Management: Users should be able to perform the following actions related to recipe management:
        a. Create new recipes: Users can create recipes by providing a title, description, list of ingredients, preparation instructions, and optional images.
        b. View recipes: Users should be able to browse and search for recipes created by themselves and other users. They can view the recipe title, ingredients, instructions, and images.
        c. Update recipes: Users can edit the details of their recipes, including the title, description, ingredients, instructions, and images. Users can only edit their recipes.
        d. Delete recipes: Users should have the ability to delete their recipes.
        e. Categorise recipes: Users can categorise recipes based on cuisine, meal type (e.g., breakfast, lunch, dinner), dietary restrictions (e.g., vegan, gluten-free), and other relevant tags.

    3. Social Features: The platform should include social features to encourage user engagement and interaction, such as:
        a. Following other users: Users should be able to follow other users whose recipes they enjoy.
        b. Liking and commenting on recipes: Users should be able to like and comment on recipes to show appreciation or provide feedback to the recipe creator.
        c. Sharing recipes: Users should be able to share recipes on social media platforms or via email.

    4.  User Profiles: Users should have profile pages to view and update their personal information, such as their name, bio, profile picture, and the list of recipes they have created.

    5. Search and Filtering: Users should be able to search for recipes based on various criteria, such as title, ingredients, cuisine, meal type, dietary restrictions, and user ratings. They should also be able to filter search results to find recipes that meet specific criteria.
    6. Recipe Recommendations: The platform should provide some recipe recommendations.

Non-functional requirements:
    1. Accessibility and Usability: The platform should be user-friendly and accessible to users with disabilities. This includes features such as keyboard navigation, screen reader support, and high contrast mode.
    2. Security: The platform should enforce proper authentication and authorisation mechanisms to ensure that users can only access their recipes and data.
    3. Performance: The platform should be optimized for performance to ensure fast load times and smooth user experience, even when dealing with large amounts of data and high user traffic.
    4. Responsive Design: The platform should be responsive and work well on different devices and screen sizes, including desktops, tablets, and mobile phones.
    5. The application’s UI and UX are critical
    6. Write unit tests using Jest: Have a sufficiently tested codebase - a coverage of not less than 70% is preferred
